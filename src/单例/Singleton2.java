package ����;
/**����׼
 * Java Singletonģʽ��Ҫ�����Ǳ�֤��JavaӦ�ó����У�һ����Classֻ��һ��ʵ�����ڡ� 
 * ʹ��Singleton�ĺô������ڿ��Խ�ʡ�ڴ棬��Ϊ��������ʵ���ĸ�����������Java�������գ�garbage collection����**/
public class Singleton2 {  
    
    private final static Singleton2 singleton2 = new Singleton2();  
      
    private Singleton2(){}
      
    public static Singleton2 getInstance(){  
        return singleton2;  
    }  
      
}  