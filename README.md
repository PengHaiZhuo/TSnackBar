# TSnackBar
顶部Snackbar，源码来自support27.1.1
<font color="#ff0000">注意：只能用于support包开发的应用引用，如果targetApi>28,请使用TSnackBar1.0.0+</font>

### 添加了样式

Type|Description
|:--:|:--:|
STYLE_ERROR|红底、白字、带error图标
STYLE_WARNING|黄底、篮字、带warning图标
STYLE_COMPLETE|绿底、白字、带complete图标

```
TopSnackBar.make(view,"警告", TopSnackBar.LENGTH_SHORT,TopSnackBar.STYLE_WARNING).show();
```

### 补充
普通Snackbar使用：
```
btn.setOnClickListener(new View.OnClickListener() {
    @Override
	public void onClick(View v) {
   Snackbar snackBar =Snackbar.make(v,"it is snackbar!",Snackbar.LENGTH_SHORT);
	 //设置SnackBar背景颜色
	 snackBar.getView().setBackgroundResource(R.color.bg_snackbar);
	 //设置按钮文字颜色
	 snackBar.setActionTextColor(Color.WHITE);
	 //设置点击事件
	 snackBar.setAction("点击", new View.OnClickListener() {
	 	@Override
	 	public void onClick(View v) {
	 		Toast.makeText(MainActivity.this,"It is Toast!",Toast.LENGTH_SHORT).show();
	 	}
	 });
	 //设置回调
	 snackBar.setCallback(new Snackbar.Callback() {
	 
	 	@Override
	 	public void onDismissed(Snackbar snackbar, int event) {
	 		super.onDismissed(snackbar, event);
	 		Toast.makeText(MainActivity.this, "Snackbar dismiss", Toast.LENGTH_SHORT).show();	
	 	}
     
	 	@Override
	 	public void onShown(Snackbar snackbar) {
	 		super.onShown(snackbar);
	 		Toast.makeText(MainActivity.this, "Snackbar show", Toast.LENGTH_SHORT).show();
	 	}
	 }).show();
	}
});
```
