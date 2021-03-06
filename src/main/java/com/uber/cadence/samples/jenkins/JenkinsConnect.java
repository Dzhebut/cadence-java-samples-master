package com.uber.cadence.samples.jenkins;

import com.offbytwo.jenkins.JenkinsServer;
import com.offbytwo.jenkins.client.JenkinsHttpClient;
import java.net.URI;
import java.net.URISyntaxException;

/** 连接 Jenkins */
public class JenkinsConnect {

  private JenkinsConnect() {}

  // 连接 Jenkins 需要设置的信息
  static final String JENKINS_URL = "http://localhost:8888/";
  static final String JENKINS_USERNAME = "Joey";
  static final String JENKINS_PASSWORD = "Duzhou112shi";

  /**
   * Http 客户端工具
   *
   * <p>如果有些 API 该Jar工具包未提供，可以用此Http客户端操作远程接口，执行命令
   *
   * @return
   */
  public static JenkinsHttpClient getClient() {
    JenkinsHttpClient jenkinsHttpClient = null;
    try {
      jenkinsHttpClient =
          new JenkinsHttpClient(new URI(JENKINS_URL), JENKINS_USERNAME, JENKINS_PASSWORD);
    } catch (URISyntaxException e) {
      e.printStackTrace();
    }
    return jenkinsHttpClient;
  }

  /** 连接 Jenkins */
  public static JenkinsServer connection() {
    JenkinsServer jenkinsServer = null;
    try {
      jenkinsServer = new JenkinsServer(new URI(JENKINS_URL), JENKINS_USERNAME, JENKINS_PASSWORD);
    } catch (URISyntaxException e) {
      e.printStackTrace();
    }
    return jenkinsServer;
  }
}
