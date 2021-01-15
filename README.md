# jmeter-dubbo-test-demo
## jmeter进行dubbo接口压力测试。

### 步骤
```
1.建立类继承AbstractJavaSamplerClient类，重写runTest方法。(Create a new class which extens from AbstractJavaSamplerClient, then overrite runTest method.)
2.打包，并将jar包放[jmeter]/lib/ext目录下。(Run packet and put the jar under directory of %jemter%/lib/ext.)
3.建立jmeter测试计划。(Set up a test plan and run it.)
```
### 测试方法
#### GUI
```$xslt
通过jmeter界面进行测试。
```

#### NONGUI
```$xslt
执行命令进行测试，适用于windows，*nix平台。
1.[jmeter]/bin目录下。
2.执行命令：jmeter -n -t xxx.jmx -l xxx.jtl
    参数说明：
    -n 非GUI模式
    -t 测试文件名称
    -l log日志文件名称
```


## Thanks

* 感谢<a href="https://www.jetbrains.com/"><img src="https://www.jetbrains.com/apple-touch-icon.png" width="64" height="64">
  jetbrains</a>提供的免费授权。
