package be.alphacredit.mailin.enums.status;

import java.util.HashMap;
import java.util.Map;

public class AS400Status {

    Map<Integer, Integer> mapStatusAS400;

    public AS400Status() {
        mapStatusAS400 = new HashMap<>();

        // status 25
        mapStatusAS400.put(10, 25);
        mapStatusAS400.put(70, 25);
        mapStatusAS400.put(71, 25);
        mapStatusAS400.put(72, 25);
        mapStatusAS400.put(73, 25);
        mapStatusAS400.put(74, 25);
        mapStatusAS400.put(75, 25);

        // status 22
        mapStatusAS400.put(02, 22);
        mapStatusAS400.put(11, 22);
        mapStatusAS400.put(60, 22);
        mapStatusAS400.put(61, 22);
        mapStatusAS400.put(62, 22);
        mapStatusAS400.put(63, 22);

        // status 17
        mapStatusAS400.put(21, 17);
        mapStatusAS400.put(22, 17);
        mapStatusAS400.put(23, 17);
        mapStatusAS400.put(25, 17);
        mapStatusAS400.put(26, 17);
        mapStatusAS400.put(28, 17);
        mapStatusAS400.put(29, 17);
        mapStatusAS400.put(50, 17);

        // status 13
        mapStatusAS400.put(01, 13);
        mapStatusAS400.put(07, 13);
        mapStatusAS400.put(17, 13);
        mapStatusAS400.put(18, 13);
        mapStatusAS400.put(20, 13);
        mapStatusAS400.put(24, 13);
        mapStatusAS400.put(27, 13);
        mapStatusAS400.put(30, 13);
        mapStatusAS400.put(34, 13);
        mapStatusAS400.put(44, 13);

        // status 05
        mapStatusAS400.put(00, 05);

        // status 03
        mapStatusAS400.put(03, 03);
        mapStatusAS400.put(12, 03);
        mapStatusAS400.put(13, 03);
        mapStatusAS400.put(14, 03);
        mapStatusAS400.put(15, 03);
    }

}
