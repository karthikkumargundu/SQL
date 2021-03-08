  *Triggers*
  
  mysql> create trigger t1 before insert on sample1
    -> for each row
    -> set new.total=new.price+new.item;
    
    
   ![tr](https://user-images.githubusercontent.com/78849193/110298165-4b8d7980-801a-11eb-8234-5db84ff80efa.PNG)

