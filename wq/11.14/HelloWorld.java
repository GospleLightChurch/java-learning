public class HelloWorld{
	int age;
	public static void main(String[] args){
		//System.out.println("HelloWorld");//函数体
		HelloWorld hw = new HelloWorld();
		HelloWorld h2 = new HelloWorld();
		hw.age = 18;
		h2.age = 15;
		h2.sys();
		hw.sys();
	}
	public void sys(){
		System.out.println(age);
	}
}
/*java 区分大小写
*类名首字母大写
*public关键字  一个Java文件只能有一个public类，类名必须和文件名一样。
*Java关键字必须小写,所有的程序都是由类组成的
*方法名main  程序的入口  public也可修饰方法  void（空）表示返回值
*main（字符串数组 参数）
*方法是面向对象，函数是面向代码的说法
*类名和参数名叫标识符，标识符必须以字母 - $开头，不能以数字开头
*/
/*7种基本类型
*byte字节，只有0和1
*short数据类型是16位
*int数据类型是32位  常用
*long数据类型是64位
*float数据类型是单精度、32位、符合IEEE 754标准的浮点数；
*double数据类型是双精度、64位、符合IEEE 754标准的浮点数； 常用
*boolean  常用
*char类型是一个单一的16位Unicode字符；
*/
/*引用类型
*string
*对象、数组都是引用数据类型。所有引用类型的默认值都是null。
*/
/*常量 用final定义
*final double PI = 3.1415927;
*/