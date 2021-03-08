  *Triggers*
  create table sample1(sampleid int(30),item int(7),price int(10),total int(14));
  insert into sample1 values(1,4,6,10);
  mysql> create trigger t1 before insert on sample1
    -> for each row
    -> set new.total=new.price+new.item;
  insert into sample1 values(4,7,2,8);
  mysql> select * from sample1;
    
    
   ![tr](https://user-images.githubusercontent.com/78849193/110298165-4b8d7980-801a-11eb-8234-5db84ff80efa.PNG)

