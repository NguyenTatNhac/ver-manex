package com.mgm.ntnguyen.chit;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;

public class ListChit {

  private static Logger log = Logger.getLogger(ListChit.class);

  public static void main(String[] args) {
    List<String> input = new ArrayList<>();
    input.add("text 1.txt");
    input.add("text 2.txt");
    input.add("tif 1.tif");
    input.add("tif 2.tif");
    input.add("text 3.txt");
    input.add("tif 3.tif");

    List<String> txtList = input.stream()
        .filter(s -> s.endsWith(".txt"))
        .collect(Collectors.toList());
    txtList.forEach(log::info);

    List<String> tifList = input.stream()
        .filter(s -> s.endsWith(".tif"))
        .collect(Collectors.toList());
    tifList.forEach(log::info);
  }
}
