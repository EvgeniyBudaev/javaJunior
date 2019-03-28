package lesson14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CollectionUtilsImpl implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result = new ArrayList<>();
        for(Integer num:a){
            result.add(num);
        }
        result.addAll(b);
        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result2 = new ArrayList<>();
        for(Integer x:a){
            if(b.contains(x)){
                result2.add(x);
                result2.add(x);
            }
        }
        return result2;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> result3 = new HashSet<>();
        result3.addAll(a);
        result3.addAll(b);
        return result3;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> result4 = new HashSet<>();
        for(Integer x:a){
            if(b.contains(x)){
                result4.add(x);
            }
        }
        //a.retainAll(b); return a;
        return result4;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result = new ArrayList<>();
        for(Integer x:a){
//            if(b.contains(x)){
//                result.remove(x);
//            }
//            else result.add(x);
            if(!b.contains(x)) { //! а правда ли что его там нет?!
                result.add(x);
            }
        }
        for(Integer x:b){
//            if(a.contains(x)){
//                result.remove(x);
//            }
//            else result.add(x);
            if(!a.contains(x)) {
                result.add(x);
            }
        }
        //a.removeAll(b); return a;
        //b.removeAll(a); return b;
        return result;
    }
}
