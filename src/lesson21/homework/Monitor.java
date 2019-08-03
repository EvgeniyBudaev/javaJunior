package lesson21.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface Monitor {
    List<String> strings = Collections.synchronizedList(new ArrayList<>());
}
