package ch12;

import java.util.function.LongSupplier;

public class Sample4 {
    LongSupplier ls = () -> {
      long b = 341;
      return b;
    };
}
