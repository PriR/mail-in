package be.alphacredit.mailin.enums.status;

import java.util.HashMap;
import java.util.Map;

public class RataStatus {

    Map<String, Integer> mapStatusRata;

    public RataStatus() {
        mapStatusRata = new HashMap<>();
        // status 17
        mapStatusRata.put("(PS)", 17);
        mapStatusRata.put("NEW", 17);
        mapStatusRata.put("PRG", 17);

        // status 13
        mapStatusRata.put("ASR", 13);
        mapStatusRata.put("UC24", 13);
        mapStatusRata.put("DL", 13);

        // status 05
        mapStatusRata.put("REF", 05);
        mapStatusRata.put("SS", 05);

        // status 22
        mapStatusRata.put("DIS", 22);
    }

}