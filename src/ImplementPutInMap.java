import java.util.HashMap;

public class ImplementPutInMap {

    public static void main(String args[]){
        HashMap map = new HashMap();
        map.put(new Key("Ananya"),25);
        map.put(new Key("Anuhya"),21);
        System.out.println("Value of Ananya is : "+map.get(new Key("Ananya")));
        System.out.println("Value of Anuhya is : "+map.get(new Key("Anuhya")));
    }
}

 class Key{
    String key;
    Key(String k){
        this.key = k;
    }

    @Override
     public int hashCode(){
        int hash = (int)key.charAt(0);
        System.out.println(key+" "+hash);
        return hash;
    }

    @Override
     public boolean equals(Object obj){
        return key.equals(((Key)obj).key);
    }
}
