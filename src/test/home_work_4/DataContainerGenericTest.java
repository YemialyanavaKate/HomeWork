package test.home_work_4;

import hw.DataContainer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DataContainerGenericTest {

   @DisplayName("Добавление не NULL в контейнер")
   @Test
   public void testAddNotNull(){
      DataContainer<String> container = new DataContainer<>(new String[0]);
      int index = container.add("Привет");
      String answer = container.get(index);
      Assertions.assertEquals(answer, "Привет");
   }

   @Test
   public void testAddNull(){
      DataContainer<String> container = new DataContainer<>(new String[0]);
      int index = container.add(null);
      Assertions.assertEquals(-1, index);

   }

   @Test
   public void testDeieteByIndex(){
      DataContainer<String> container = new DataContainer<>(new String[0]);
      int index = container.add("Привет");
      container.delete(index);
      String answer = container.get(index);
       Assertions.assertNull(answer);
   }


   @Test
   public void testDeieteByItem(){
      DataContainer<String> container = new DataContainer<>(new String[0]);
      int index = container.add("Привет");
      container.delete("Привет");
      String answer = container.get(index);
       Assertions.assertNull(answer);
   }

}
