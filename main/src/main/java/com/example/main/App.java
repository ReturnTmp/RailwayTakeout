package com.example.main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 * 测试使用加载本地html
 */
public class App extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        // 创建一个网络容器
        WebView webView = new WebView();
        WebEngine engine = webView.getEngine();

        // 获取本地html文件, 注意文件目录，注意与调用路径一致
        String url = getClass().getResource("index.html").toExternalForm();
        // 如果是网络上的站点，直接使用 engine.load("http://www.damengsanqian.com/")
        engine.load(url);

        Scene scene = new Scene(webView, 640, 480);
        stage.setScene(scene);
        stage.show();
    }
}
