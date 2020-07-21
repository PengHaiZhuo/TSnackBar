# TSnackBar
顶部Snackbar，源码来自material:1.1.0

TopSnackbar除了在顶部外，和普通Snackbar使用一样：
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
