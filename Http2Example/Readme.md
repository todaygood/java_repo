
# 使用jdk 11 run 程序

```
"HTTP_2"
server: nginx
date: Sat, 01 Feb 2020 10:37:16 GMT
content-type: text/html
content-length: 18162
last-modified: Thu, 05 Dec 2019 06:11:50 GMT
etag: "5de89fa6-46f2"
strict-transport-security: max-age=15768000; includeSubdomains; preload;
content-security-policy: default-src 'none'; frame-ancestors 'none'; script-src 'self'; img-src 'self'; style-src 'self'; base-uri 'self'; form-action 'self';
referrer-policy: no-referrer, strict-origin-when-cross-origin
x-frame-options: SAMEORIGIN
x-content-type-options: nosniff
x-xss-protection: 1; mode=block
accept-ranges: bytes

<!DOCTYPE html>
<html lang="zh-cn">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>Fliaping&#39;s Blog</title>
  <meta name="renderer" content="webkit" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1"/>
```

# 使用jdk 8 run 
```
"C:\Program Files\Java\jdk1.8.0_191\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2019.1.1\lib\idea_rt.jar=59794:C:\Program Files\JetBrains\IntelliJ IDEA 2019.1.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_191\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_191\jre\lib\rt.jar;C:\Source\todaygood\java_repo\Http2Example\target\classes;C:\Users\margi\.m2\repository\com\squareup\okhttp3\okhttp\4.3.1\okhttp-4.3.1.jar;C:\Users\margi\.m2\repository\com\squareup\okio\okio\2.4.1\okio-2.4.1.jar;C:\Users\margi\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-common\1.3.50\kotlin-stdlib-common-1.3.50.jar;C:\Users\margi\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib\1.3.61\kotlin-stdlib-1.3.61.jar;C:\Users\margi\.m2\repository\org\jetbrains\annotations\13.0\annotations-13.0.jar;C:\Users\margi\.m2\repository\com\alibaba\fastjson\1.2.62\fastjson-1.2.62.jar" PingAn.Http2Example
"HTTP_1_1"
Server: nginx
Date: Sat, 01 Feb 2020 10:50:52 GMT
Content-Type: text/html
Content-Length: 18162
Last-Modified: Thu, 05 Dec 2019 06:11:50 GMT
Connection: keep-alive
ETag: "5de89fa6-46f2"
Strict-Transport-Security: max-age=15768000; includeSubdomains; preload;
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'; script-src 'self'; img-src 'self'; style-src 'self'; base-uri 'self'; form-action 'self';
Referrer-Policy: no-referrer, strict-origin-when-cross-origin
X-Frame-Options: SAMEORIGIN
X-Content-Type-Options: nosniff
X-XSS-Protection: 1; mode=block
Accept-Ranges: bytes

<!DOCTYPE html>
<html lang="zh-cn">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>Fliaping&#39;s Blog</title>
  <meta name="renderer" content="webkit" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1"/>

```