package Nember2;

import java.util.StringTokenizer;

public class Addres
{
    private String country,region,city,street,house,block,flat;
    public Addres() { }
    public void AddAddres(String s,int i)
    {
        if(i==0)
        {
            country=s;
        }
        if(i==1)
        {
            region=s;
        }
        if(i==2)
        {
            city=s;
        }
        if(i==3)
        {
            street=s;
        }
        if(i==4)
        {
            house=s;
        }
        if(i==5)
        {
            block=s;
        }
        if(i==6)
        {
            flat=s;
        }
    }
    public String toString()
    {
        return ("Полный адрес: "+country+" "+region+" "+city+" "+street+" "+house+" "+block+" "+flat);
    }
    public static void main(String []args)
    {
        int i=0,j=0;
        Addres addres = new Addres();
        String str1=new String("   Россия,77,Москва,Единства,52,1б/2,98  ");
        System.out.println(str1=str1.replaceAll(" ",""));//Удаление пробелов
        for (String retval : str1.split(",")) //Задание а
        {
            addres.AddAddres(retval,i);
            i++;
        }
        System.out.println(addres.toString());



        String str2=new String("   Россия,77.Москва;Единства-52-1б/2,98  ");
        System.out.println(str2=str2.replaceAll(" ",""));//Удаление пробелов
        StringTokenizer st = new StringTokenizer(str2, ",.;-");//Задание b
        while (st.hasMoreTokens())
        {
            addres.AddAddres(st.nextToken(),j);
            j++;
        }
        System.out.println(addres.toString());

    }
}