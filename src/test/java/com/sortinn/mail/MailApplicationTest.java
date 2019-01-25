package com.sortinn.mail;

import com.sortinn.mail.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.mail.MessagingException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailApplicationTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MailApplicationTest.class);

    @Resource
    MailService mailService;

    @Test
    public void sayHelloTest() {
        mailService.sayHello();
    }

    @Test
    public void simpleMailSendTest() {
        mailService.sendSimpleMail("sortinndecar@gmail.com", "我用SpringBoot发送的第一封邮件", "大家好，这是我用springboot发送的第一封电子邮件！");
    }

    @Test
    public void htmlMailSendTest() {
        String content = "<!DOCTYPE html>\n" +
                "<!-- saved from url=(0021)https://sortinn.club/ -->\n" +
                "<html class=\"light page-home\" data-blockbyte-bs-uid=\"84167\"><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"><meta name=\"generator\" content=\"Hexo 3.8.0\">\n" +
                "  \n" +
                "  \n" +
                "  <title>Gran Turismo</title>\n" +
                "\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n" +
                "\n" +
                "  \n" +
                "    <meta name=\"keywords\" content=\"CS, Java, 计算机, 生活, Hip-Hop, 工作\">\n" +
                "  \n" +
                "\n" +
                "  <meta name=\"description\" content=\"Java\">\n" +
                "<meta property=\"og:type\" content=\"website\">\n" +
                "<meta property=\"og:title\" content=\"Gran Turismo\">\n" +
                "<meta property=\"og:url\" content=\"https://sortinn.club/index.html\">\n" +
                "<meta property=\"og:site_name\" content=\"Gran Turismo\">\n" +
                "<meta property=\"og:description\" content=\"Java\">\n" +
                "<meta property=\"og:locale\" content=\"default\">\n" +
                "<meta name=\"twitter:card\" content=\"summary\">\n" +
                "<meta name=\"twitter:title\" content=\"Gran Turismo\">\n" +
                "<meta name=\"twitter:description\" content=\"Java\">\n" +
                "\n" +
                "  \n" +
                "\n" +
                "  \n" +
                "    <link rel=\"icon\" href=\"https://sortinn.club/favicon.ico\">\n" +
                "  \n" +
                "\n" +
                "  <link href=\"./Gran Turismo_files/styles.css\" rel=\"stylesheet\">\n" +
                "\n" +
                "\n" +
                "  \n" +
                "    <link rel=\"stylesheet\" href=\"./Gran Turismo_files/personal-style.css\">\n" +
                "  \n" +
                "\n" +
                "  \n" +
                "<!-- Google Analytics -->\n" +
                "<script src=\"./Gran Turismo_files/push.js\"></script><script src=\"./Gran Turismo_files/hm.js\"></script><script async=\"\" src=\"./Gran Turismo_files/analytics.js\"></script><script type=\"text/javascript\">\n" +
                "(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){\n" +
                "(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),\n" +
                "m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)\n" +
                "})(window,document,'script','//www.google-analytics.com/analytics.js','ga');\n" +
                "\n" +
                "ga('create', 'UA-38189205-1', 'auto');\n" +
                "ga('send', 'pageview');\n" +
                "\n" +
                "</script>\n" +
                "<!-- End Google Analytics -->\n" +
                "\n" +
                "\n" +
                "  \n" +
                "  <script type=\"text/javascript\">\n" +
                "    var _hmt = _hmt || [];\n" +
                "    (function() {\n" +
                "      var hm = document.createElement(\"script\");\n" +
                "      hm.src = \"//hm.baidu.com/hm.js?57e94d016e201fba3603a8a2b0263af0\";\n" +
                "      var s = document.getElementsByTagName(\"script\")[0];\n" +
                "      s.parentNode.insertBefore(hm, s);\n" +
                "    })();\n" +
                "  </script>\n" +
                "\n" +
                "\n" +
                "  \n" +
                "  <script type=\"text/javascript\">\n" +
                "\t(function(){\n" +
                "\t    var bp = document.createElement('script');\n" +
                "\t    var curProtocol = window.location.protocol.split(':')[0];\n" +
                "\t    if (curProtocol === 'https') {\n" +
                "\t        bp.src = 'https://zz.bdstatic.com/linksubmit/push.js';        \n" +
                "\t    }\n" +
                "\t    else {\n" +
                "\t        bp.src = 'http://push.zhanzhang.baidu.com/push.js';\n" +
                "\t    }\n" +
                "\t    var s = document.getElementsByTagName(\"script\")[0];\n" +
                "\t    s.parentNode.insertBefore(bp, s);\n" +
                "\t})();\n" +
                "  </script>\n" +
                "\n" +
                "\n" +
                "\n" +
                "  \n" +
                "    <script async=\"\" src=\"./Gran Turismo_files/busuanzi.pure.mini.js\"></script>\n" +
                "    <link rel=\"stylesheet\" href=\"./Gran Turismo_files/font-awesome.min.css\">\n" +
                "  \n" +
                "\n" +
                "<style class=\"blockbyte-bs-style\" data-name=\"content\">body>div#blockbyte-bs-indicator>div{opacity:0;pointer-events:none}body>iframe#blockbyte-bs-sidebar.blockbyte-bs-visible,body>iframe#blockbyte-bs-overlay.blockbyte-bs-visible{opacity:1;pointer-events:auto}body.blockbyte-bs-noscroll{overflow:hidden !important}body>div#blockbyte-bs-indicator>div{position:absolute;transform:translate3d(-40px, 0, 0);top:0;left:0;width:40px !important;height:100%;background:rgba(0,0,0,0.5);border-radius:0 10px 10px 0;transition:opacity 0.3s, transform 0.3s;z-index:2}body>div#blockbyte-bs-indicator>div>span{-webkit-mask:no-repeat center/32px;-webkit-mask-image:url(chrome-extension://jdbnofccmhefkmjbkkdkfiicjkgofkdh/img/icon-bookmark.svg);background-color:#ffffff;position:absolute;display:block;top:0;left:0;width:100%;height:100%}body>div#blockbyte-bs-indicator[data-pos='right']{left:auto;right:0}body>div#blockbyte-bs-indicator[data-pos='right']>div{transform:translate3d(40px, 0, 0);left:auto;right:0;border-radius:10px 0 0 10px}body>div#blockbyte-bs-indicator.blockbyte-bs-fullHeight>div{border-radius:0}body>div#blockbyte-bs-indicator.blockbyte-bs-hover>div{transform:translate3d(0, 0, 0);opacity:1}body>div#blockbyte-bs-indicator[data-pos='left'].blockbyte-bs-has-lsb{height:100% !important;top:0 !important}body>div#blockbyte-bs-indicator[data-pos='left'].blockbyte-bs-has-lsb>div{background:transparent}body>div#blockbyte-bs-indicator[data-pos='left'].blockbyte-bs-has-lsb>div>span{-webkit-mask-position-y:20px}body>iframe#blockbyte-bs-sidebar{width:250px;max-width:none;height:0;z-index:2147483646;background-color:rgba(255,255,255,0.8) !important;border:none;display:block !important;transform:translate3d(-250px, 0, 0);transition:width 0s 0.3s, height 0s 0.3s, opacity 0.3s, transform 0.3s}body>iframe#blockbyte-bs-sidebar[data-pos='right']{left:auto;right:0;transform:translate3d(250px, 0, 0)}body>iframe#blockbyte-bs-sidebar.blockbyte-bs-visible{width:calc(100% + 250px);height:100%;transform:translate3d(0, 0, 0);transition:opacity 0.3s, transform 0.3s}body>iframe#blockbyte-bs-sidebar.blockbyte-bs-hideMask{background:none !important}body>iframe#blockbyte-bs-sidebar.blockbyte-bs-hideMask:not(.blockbyte-bs-hover){width:calc(250px + 50px)}body>iframe#blockbyte-bs-overlay{width:100%;max-width:none;height:100%;z-index:2147483647;border:none;background:rgba(0,0,0,0.5) !important;transition:opacity 0.3s}\n" +
                "</style><script src=\"chrome-extension://ocggccaacacpienfcgmgcihoombokbbj/pages/client/livestartpage-message-add.js\"></script><script type=\"text/javascript\" src=\"./Gran Turismo_files/bundle.js\"></script></head>\n" +
                "<body>\n" +
                "\n" +
                "\n" +
                "\n" +
                "  \n" +
                "\n" +
                "  \n" +
                "  <div class=\"content-home text-center\">\n" +
                "  <a class=\"avatar\" href=\"https://sortinn.club/\">\n" +
                "    <img src=\"./Gran Turismo_files/avatar.jpg\" alt=\"\">\n" +
                "  </a>\n" +
                "  <h1 class=\"name\" style=\"font-family: calligraffittiregular\">\n" +
                "    Gran Turismo\n" +
                "  </h1>\n" +
                "  <div class=\"slogan\">\n" +
                "    技术融入生活，才更具魅力\n" +
                "  </div>\n" +
                "\n" +
                "  <hr>\n" +
                "\n" +
                "  <ul class=\"text-center nav\">\n" +
                "    \n" +
                "      <li class=\"item\">\n" +
                "        \n" +
                "          <a href=\"https://sortinn.club/archives\">Blog</a>\n" +
                "        \n" +
                "        <span>|</span>\n" +
                "      </li>\n" +
                "    \n" +
                "      <li class=\"item\">\n" +
                "        \n" +
                "          <a href=\"https://sortinn.club/album/\" rel=\"noopener noreferrer\" target=\"_blank\">Album</a>\n" +
                "        \n" +
                "        <span>|</span>\n" +
                "      </li>\n" +
                "    \n" +
                "      <li class=\"item\">\n" +
                "        \n" +
                "          <a href=\"https://github.com/Sortinn\" rel=\"noopener noreferrer\" target=\"_blank\">Github</a>\n" +
                "        \n" +
                "        <span>|</span>\n" +
                "      </li>\n" +
                "    \n" +
                "      <li class=\"item\">\n" +
                "        \n" +
                "          <a href=\"https://twitter.com/sortinnn\" rel=\"noopener noreferrer\" target=\"_blank\">Twitter</a>\n" +
                "        \n" +
                "        <span>|</span>\n" +
                "      </li>\n" +
                "    \n" +
                "  </ul>\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "  <div class=\"modal\" id=\"modal\">\n" +
                "  <span id=\"cover\" class=\"cover hide\"></span>\n" +
                "  <div id=\"modal-dialog\" class=\"modal-dialog hide-dialog\">\n" +
                "    <div class=\"modal-header\">\n" +
                "      <span id=\"close\" class=\"btn-close\">关闭</span>\n" +
                "    </div>\n" +
                "    <hr>\n" +
                "    <div class=\"modal-body\">\n" +
                "      <ul class=\"list-toolbox\">\n" +
                "        \n" +
                "          <li class=\"item-toolbox\">\n" +
                "            <a class=\"CIRCLE\" href=\"https://sortinn.club/archives/\" rel=\"noopener noreferrer\" target=\"_self\">\n" +
                "              博客\n" +
                "            </a>\n" +
                "          </li>\n" +
                "        \n" +
                "          <li class=\"item-toolbox\">\n" +
                "            <a class=\"CIRCLE\" href=\"https://sortinn.club/category/\" rel=\"noopener noreferrer\" target=\"_self\">\n" +
                "              分类\n" +
                "            </a>\n" +
                "          </li>\n" +
                "        \n" +
                "          <li class=\"item-toolbox\">\n" +
                "            <a class=\"CIRCLE\" href=\"https://sortinn.club/tag/\" rel=\"noopener noreferrer\" target=\"_self\">\n" +
                "              标签\n" +
                "            </a>\n" +
                "          </li>\n" +
                "        \n" +
                "          <li class=\"item-toolbox\">\n" +
                "            <a class=\"CIRCLE\" href=\"https://sortinn.club/link/\" rel=\"noopener noreferrer\" target=\"_self\">\n" +
                "              友链\n" +
                "            </a>\n" +
                "          </li>\n" +
                "        \n" +
                "          <li class=\"item-toolbox\">\n" +
                "            <a class=\"CIRCLE\" href=\"https://sortinn.club/about/\" rel=\"noopener noreferrer\" target=\"_self\">\n" +
                "              关于\n" +
                "            </a>\n" +
                "          </li>\n" +
                "        \n" +
                "          <li class=\"item-toolbox\">\n" +
                "            <a class=\"CIRCLE\" href=\"https://sortinn.club/search/\" rel=\"noopener noreferrer\" target=\"_self\">\n" +
                "              搜索\n" +
                "            </a>\n" +
                "          </li>\n" +
                "        \n" +
                "      </ul>\n" +
                "\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "  \n" +
                "\n" +
                "  <script type=\"text/javascript\">\n" +
                "  function loadScript(url, callback) {\n" +
                "    var script = document.createElement('script')\n" +
                "    script.type = 'text/javascript';\n" +
                "\n" +
                "    if (script.readyState) { //IE\n" +
                "      script.onreadystatechange = function() {\n" +
                "        if (script.readyState == 'loaded' ||\n" +
                "          script.readyState == 'complete') {\n" +
                "          script.onreadystatechange = null;\n" +
                "          callback();\n" +
                "        }\n" +
                "      };\n" +
                "    } else { //Others\n" +
                "      script.onload = function() {\n" +
                "        callback();\n" +
                "      };\n" +
                "    }\n" +
                "\n" +
                "    script.src = url;\n" +
                "    document.getElementsByTagName('head')[0].appendChild(script);\n" +
                "  }\n" +
                "\n" +
                "  window.onload = function() {\n" +
                "    loadScript('/js/bundle.js?235683', function() {\n" +
                "      // load success\n" +
                "    });\n" +
                "  }\n" +
                "</script>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<iframe id=\"blockbyte-bs-sidebar\" class=\"notranslate\" data-pos=\"right\" src=\"./Gran Turismo_files/saved_resource.html\"></iframe><div id=\"blockbyte-bs-indicator\" class=\"blockbyte-bs-fullHeight\" style=\"width: 21px; height: 100%; top: 0%;\"></div></body></html>";

        try {
            mailService.sendHtmlMail("sortinndecar@gmail.com", "我用SpringBoot发送的第一封HTML邮件", content);
        } catch (MessagingException e) {
            LOGGER.error("发送邮件失败");
        }
    }


}

