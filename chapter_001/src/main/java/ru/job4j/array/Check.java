package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
          boolean result = true;
          for (int i = 0; i < data.length; i++) {
              for (int j = 1; j < data.length; j++) {
                  if (data[j] != data[i]) {
                      result = false;
                      break;
                  }
              }
          }
        return result;
    }
}
