class Address
{
String city,state,country;
Address(String city,String state, String country)
{
this.city=city;
this.stste=state;
this.country=country;
}
}
 class Emp
{
int id;
String name;
Address address;
Emp(int id,String name,Address address)
{
this.id=id;
this.name=name;
this.address=address;
}
void disp()
{
System.out.println(id"+name);
System.out.println(address.city+" "+address.state+" 
"+address.country);
}
public static void main(String arg[]);
{
Address add1=new Address("patna", "Bihar","India");
Address add2=new Address("kanpur", "up","India");
Emp e1=new Emp(100,"Amit",add1);
Emp e2=new Emp(101,"umar",add2);
e1.disp();
e2.disp();
}
}


