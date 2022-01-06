## 启动说明
- 查看node版本：`node -v`
- 配置npm镜像仓库地址： `npm config set registry http://registry.npm.taobao.org/`
- 安装依赖：`npm install`
- 报错问题：主要是node-sass版本问题，它的版本需要和node版本对应
  - [https://github.com/sass/node-sass/releases]( https://github.com/sass/node-sass/releases) 可查看对应关系
  - 当前个人版本v16.13.1，可用7.0.0版本
  - 更改 package.json 文件的 node-sass 版本
- 重新安装：`npm install`
- 启动项目：`npm run dev`

## renren-fast-vue
- renren-fast-vue基于vue、element-ui构建开发，实现[renren-fast](https://gitee.com/renrenio/renren-fast)后台管理前端功能，提供一套更优的前端解决方案
- 前后端分离，通过token进行数据交互，可独立部署
- 主题定制，通过scss变量统一一站式定制
- 动态菜单，通过菜单管理统一管理访问路由
- 数据切换，通过mock配置对接口数据／mock模拟数据进行切换
- 发布时，可动态配置CDN静态资源／切换新旧版本
- 演示地址：[http://demo.open.renren.io/renren-fast](http://demo.open.renren.io/renren-fast) (账号密码：admin/admin)

![输入图片说明](https://images.gitee.com/uploads/images/2019/0305/133529_ff15f192_63154.png "01.png")
![输入图片说明](https://images.gitee.com/uploads/images/2019/0305/133537_7a1b2d85_63154.png "02.png")


## 说明文档
项目开发、部署等说明都在[wiki](https://github.com/renrenio/renren-fast-vue/wiki)中。


## 更新日志
每个版本的详细更改都记录在[release notes](https://github.com/renrenio/renren-fast-vue/releases)中。
