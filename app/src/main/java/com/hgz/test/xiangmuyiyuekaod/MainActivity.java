package com.hgz.test.xiangmuyiyuekaod;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;

import com.google.gson.Gson;
import com.hgz.test.xiangmuyiyuekaod.adapter.MyListviewAdapter;
import com.hgz.test.xiangmuyiyuekaod.bean.Info;
import com.limxing.xlistview.view.XListView;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.io.File;
import java.util.List;

public class MainActivity extends AppCompatActivity implements XListView.IXListViewListener {

    private XListView xlv;
    private boolean flag;
    private MyListviewAdapter myListviewAdapter;
    private int index=1;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        xlv = (XListView) findViewById(R.id.xlv);
        xlv.setPullLoadEnable(true);
        xlv.setXListViewListener(this);
        getDatas();
        xlv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //点击每个条目，展示选择网络状态的对话框
                showSettingsNetWorkDialog();
            }
        });
    }
    private void downloadApk(){
        String url="http://gdown.baidu.com/data/wisegame/f98d235e39e29031/baiduxinwen.apk";

        final String path= Environment.getExternalStorageDirectory()+"/apk/myapk.apk";
        File file = new File(path);
        RequestParams requestParams = new RequestParams(url);
        requestParams.setAutoRename(false);
        requestParams.setAutoResume(true);
        //设置下载下来的APK保存路径
        requestParams.setSaveFilePath(path);
        x.http().get(requestParams, new Callback.ProgressCallback<File>() {
            @Override
            public void onSuccess(File result) {
                //成功时，调用安卓开发 apk安装的方法
                installDownloadApk(result);
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {
                //完成时，使显示下载进度的进度条消失
                if (progressDialog.isShowing()){
                    progressDialog.dismiss();
                }
            }

            @Override
            public void onWaiting() {

            }

            @Override
            public void onStarted() {
                //开始时，显示进度条
                showDownloadApkProgressDialog();
            }

            @Override
            public void onLoading(long total, long current, boolean isDownloading) {
                //让进度条实时更新
                float progress=(float)current/(float)total*100;
                if (progress>=0&&progress<=100){
                    progressDialog.setProgress((int) progress);
                }
            }
        });
    }
    //请求网络接口，获取数据的方法
    private void getDatas(){
        String url="http://apis.juhe.cn/oil/region";
        RequestParams requestParams = new RequestParams(url);
        requestParams.addQueryStringParameter("city","北京");
        requestParams.addQueryStringParameter("key","779a95a32a7684cfa9b2a4769a740be2");
        requestParams.addQueryStringParameter("page",index+"");
        x.http().get(requestParams, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                Info info = gson.fromJson(result, Info.class);
                List<Info.ResultBean.DataBean> data = info.getResult().getData();
                if (myListviewAdapter==null) {
                    myListviewAdapter = new MyListviewAdapter(MainActivity.this, data);
                    xlv.setAdapter(myListviewAdapter);
                }else{
                    myListviewAdapter.loadMore(data,flag);
                    myListviewAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }
    //允许上拉刷新
    @Override
    public void onRefresh() {
        index++;
        getDatas();
        flag=true;
        xlv.stopRefresh(true);
    }
    //允许下拉加载
    @Override
    public void onLoadMore() {
        index++;
        getDatas();
        flag=false;
        xlv.stopLoadMore();
    }
    //选择网络状态的对话框
    private void showSettingsNetWorkDialog(){
        String[] netWorkName={"Wifi","手机流量"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setTitle("网络选择");
        final int mode = getSharedPreferences("checked", MODE_PRIVATE).getInt("which", 3);

        builder.setSingleChoiceItems(netWorkName,mode, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                getSharedPreferences("checked",MODE_PRIVATE).edit().putInt("which",which).commit();
                dialog.dismiss();
                //当选中Wifi状态时，展示提示apk更新的对话框
                if (which==0){
                    showApkUpDataDialog();
                }else if (which==1){//当选中手机网络状态时，跳转到设置Wifi界面
                    Intent intent = new Intent();
                    intent.setAction(Settings.ACTION_WIFI_SETTINGS);
                    startActivity(intent);
                }
            }
        });
        builder.create().show();
    }
    //提示apk更新的对话框
    private void showApkUpDataDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("版本更新");
        builder.setMessage("现在检测到新版本，是否跟新？");
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                    downloadApk();
            }
        });
        builder.setNegativeButton("取消",null);
        builder.create().show();
    }
    //下载进度条对话框
    private void showDownloadApkProgressDialog(){
        progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("请等待。。。");
        progressDialog.setMessage("正在下载中......");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setProgress(0);
        progressDialog.show();
    }
    //安卓开发 apk安装
    private void installDownloadApk(File result) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setDataAndType(Uri.fromFile(result), "application/vnd.android.package-archive");
        startActivity(intent);
    }
}
