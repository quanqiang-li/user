[toc]
# 简介
eureka 客户端,用户服务
集群部署
# 打包 pom中配置了profiles 需要指定-P
## peer1 节点 略过测试编译和执行
mvn clean package -P peer1 -Dmaven.test.skip=true
## peer2 节点
mvn clean package -P peer2 -Dmaven.test.skip=true
# 部署
nohup java -jar user-peer1.jar>user1.out 2>&1 &
nohup java -jar user-peer2.jar>user2.out 2>&1 &

# 访问
http://ip:8771/  
http://ip:8772/  
![注册中心](https://note.youdao.com/yws/public/resource/030c5ed1a14c969b99e35b06051c9f7a/xmlnote/D8A74FEBE1BC4DF38557A65880439EC9/65675)
