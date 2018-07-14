import java.util.*;
public class Main {
public static void main(String[] args) {
String ts;
int value=0, trump=0;
char type, suit;
int a,b,c2,d2,x,y;
boolean st=false,ht=false,dt=false,ct=false;
Hashtable<Character,Boolean> s = new Hashtable<Character,Boolean>();
Hashtable<Character,Boolean> h = new Hashtable<Character,Boolean>();
Hashtable<Character,Boolean> d = new Hashtable<Character,Boolean>();
Hashtable<Character,Boolean> c = new Hashtable<Character,Boolean>();
Scanner sc = new Scanner(System.in);
for(int i=0; i<13; i++) {
	ts=sc.next();
	type=ts.charAt(0);
	suit=ts.charAt(1);
	if(suit=='S') {
		s.put(type, true);
		if(type=='A') {
			value+=4;
			st=true;
		}else if(type=='K') {
			value+=3;
		}else if(type=='Q') {
			value+=2;
		}else if(type=='J') {
			value+=1;
		}
	}else if(suit=='H') {
		h.put(type, true);
		if(type=='A') {
			value+=4;
			ht=true;
		}else if(type=='K') {
			value+=3;
		}else if(type=='Q') {
			value+=2;
		}else if(type=='J') {
			value+=1;
		}
	}else if(suit=='D') {
		d.put(type, true);
		if(type=='A') {
			value+=4;
			dt=true;
		}else if(type=='K') {
			value+=3;
		}else if(type=='Q') {
			value+=2;
		}else if(type=='J') {
			value+=1;
		}
	}else {
		c.put(type, true);
		if(type=='A') {
			value+=4;
			ct=true;
		}else if(type=='K') {
			value+=3;
		}else if(type=='Q') {
			value+=2;
		}else if(type=='J') {
			value+=1;
		}
	}
}
if(s.size()>=1) {
	if(s.size()==1&&s.get('K')!=null&&s.get('K')==true) {
		value-=1;
	}
	if(s.size()<=2&&s.get('Q')!=null&&s.get('Q')==true) {
		value-=1;
	}
	if(s.size()<=3&&s.get('J')!=null&&s.get('J')==true) {
		value-=1;
	}
}else if(s.size()>=2&&s.get('K')!=null&&s.get('K')==true) {
	st=true;
}else if(s.size()>=3&&s.get('Q')!=null&&s.get('Q')==true) {
	st=true;
}
if(h.size()>=1) {
	if(h.size()==1&&h.get('K')!=null&&h.get('K')==true) {
		value-=1;
	}
	if(h.size()<=2&&h.get('Q')!=null&&h.get('Q')==true) {
		value-=1;
	}
	if(h.size()<=3&&h.get('J')!=null&&h.get('J')==true) {
		value-=1;
	}
}else if(h.size()>=2&&h.get('K')!=null&&h.get('K')==true) {
	ht=true;
}else if(h.size()>=3&&h.get('Q')!=null&&h.get('Q')==true) {
	ht=true;
}
if(d.size()>=1) {
	if(d.size()==1&&d.get('K')!=null&&d.get('K')==true) {
		value-=1;
	}
	if(d.size()<=2&&d.get('Q')!=null&&d.get('Q')==true) {
		value-=1;
	}
	if(d.size()<=3&&d.get('J')!=null&&d.get('J')==true) {
		value-=1;
	}
}else if(d.size()>=2&&d.get('K')!=null&&d.get('K')==true) {
	dt=true;
}else if(d.size()>=3&&d.get('Q')!=null&&d.get('Q')==true) {
	dt=true;
}
if(c.size()>=1) {
	if(c.size()==1&&c.get('K')!=null&&c.get('K')==true) {
		value-=1;
	}
	if(c.size()<=2&&c.get('Q')!=null&&c.get('Q')==true) {
		value-=1;
	}
	if(c.size()<=3&&c.get('J')!=null&&c.get('J')==true) {
		value-=1;
	}
}else if(c.size()>=2&&c.get('K')!=null&&c.get('K')==true) {
	ct=true;
}else if(c.size()>=3&&c.get('K')!=null&&c.get('Q')==true) {
	st=true;
}
trump=value;
if(s.size()==2) {
	value+=1;
}
if(h.size()==2) {
	value+=1;
}
if(d.size()==2) {
	value+=1;
}
if(c.size()==2) {
	value+=1;
}
if(s.size()==1) {
	value+=2;
}
if(h.size()==1) {
	value+=2;
}
if(d.size()==1) {
	value+=2;
}
if(c.size()==1) {
	value+=2;
}
if(s.size()==0) {
	value+=2;
}
if(h.size()==0) {
	value+=2;
}
if(d.size()==0) {
	value+=2;
}
if(c.size()==0) {
	value+=2;
}
if(value<14) {
	System.out.println("PASS");
}else {
	if(trump>=16&&st==true&&ht==true&&dt==true&&ct==true) {
		System.out.println("NO-TRUMP");
	}else {
		a = Math.max(s.size(), h.size());
		b = Math.max(d.size(), c.size());
		if(a>b) {
			if(s.size()>h.size()) {
				System.out.println("BID S");
			}else if(s.size()<h.size()) {
				System.out.println("BID H");
			}else {
				System.out.println("BID S");
			}
		}else if(a<b) {
			if(d.size()>c.size()) {
				System.out.println("BID D");
			}else if(d.size()<c.size()) {
				System.out.println("BID C");
			}else {
				System.out.println("BID D");
			}
		}else {
			System.out.println("BID S");
		}
	}
}
}
}