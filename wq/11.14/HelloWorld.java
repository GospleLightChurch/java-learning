public class HelloWorld{
	int age;
	public static void main(String[] args){
		//System.out.println("HelloWorld");//������
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
/*java ���ִ�Сд
*��������ĸ��д
*public�ؼ���  һ��Java�ļ�ֻ����һ��public�࣬����������ļ���һ����
*Java�ؼ��ֱ���Сд,���еĳ�����������ɵ�
*������main  ��������  publicҲ�����η���  void���գ���ʾ����ֵ
*main���ַ������� ������
*������������󣬺�������������˵��
*�����Ͳ������б�ʶ������ʶ����������ĸ - $��ͷ�����������ֿ�ͷ
*/
/*7�ֻ�������
*byte�ֽڣ�ֻ��0��1
*short����������16λ
*int����������32λ  ����
*long����������64λ
*float���������ǵ����ȡ�32λ������IEEE 754��׼�ĸ�������
*double����������˫���ȡ�64λ������IEEE 754��׼�ĸ������� ����
*boolean  ����
*char������һ����һ��16λUnicode�ַ���
*/
/*��������
*string
*�������鶼�������������͡������������͵�Ĭ��ֵ����null��
*/
/*���� ��final����
*final double PI = 3.1415927;
*/