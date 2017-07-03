# jmeter-dubbo-test-demo
## jmeter进行dubbo接口压力测试。

### 步骤
```
1.建立类继承AbstractJavaSamplerClient类，重写runTest方法。
2.打包，并将jar包放[jmeter]/lib/ext目录下。
3.建立jmeter测试计划。
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