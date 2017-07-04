# EvenBus2.x
前言

##  一个非常好用的跨Activity,跨Fragment,跨线程,之间数据传输的一个类似广播但是比广播简单很多第三方jar包

### 使用教程

#### 1.导入jar包

#### 2.EventBus.getDefault().register(this); 注册一个

#### 3EventBus.getDefault().post(new FirstEvent("往第一个Activity发消息")); 在第二个Acitivity， Fragment， 对话框 ，子线程随意一个中发送一个post这个post里面一般是一个对象，这个实体类一般是内部类


####  4 public void onEventMainThread(FirstEvent event) {
#### 		String msg = "onEventMainThread收到了消息：" + event.getMsg();
#### 		Log.d("harvic", msg);
#### 		tv.setText(msg);
#### 		Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
#### 	}   

#### 在前面一个你想接收的类Frg，对话框或者任意中注册这个 广播接收，当后面一个发送post时候 前面这个注册了的就会接受到对象，从而进行操作



##  通过EventBus可以让我们的代码变得非常简洁明了，也不用再考虑数据的传输和转化，子线程和主线程的问题
