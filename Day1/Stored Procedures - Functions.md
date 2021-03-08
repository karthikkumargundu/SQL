**Stored Procedures**

*Q1:Display the count of Movies having length above 16.*

CREATE DEFINER=`root`@`localhost` PROCEDURE `getCount`()<br>
BEGIN<br>
select count(Moviename) from movies where length>16;<br>
END<br>

![P1](https://user-images.githubusercontent.com/78849193/110283607-5a6a3100-8006-11eb-8ecc-2ea7c17919f7.PNG)


*Q2:Display all the details of movies the language that first name starts with 'h'.*

CREATE DEFINER=`root`@`localhost` PROCEDURE `getDetails`()<br>
BEGIN<br>
select Moviename from movies where language like "h%";<br>
END<br>

![P2](https://user-images.githubusercontent.com/78849193/110283676-74a40f00-8006-11eb-893e-82837b9f45b7.PNG)


*Q3:Dispaly the movie having maximum length.*

CREATE DEFINER=`root`@`localhost` PROCEDURE `getMax`()<br>
BEGIN<br>
select Moviename from movies where length=(select max(length) from movies);<br>
END<br>

![P3](https://user-images.githubusercontent.com/78849193/110283698-808fd100-8006-11eb-969e-ce9ecb482c69.PNG)


*Q4:Display the Name of Movies, Movietype is starts with Hooror.*

CREATE DEFINER=`root`@`localhost` PROCEDURE `getMovieName`()<br>
BEGIN<br>
select Moviename from movies where Movietype like "Horror%";<br>
END<br>

![P4](https://user-images.githubusercontent.com/78849193/110283808-ab7a2500-8006-11eb-8132-cf13ad4e0448.PNG)

*Q5:Display the Moviename , Heroname,Heroinename whose having maximum length.*

CREATE DEFINER=`root`@`localhost` PROCEDURE `getRes`()<br>
BEGIN<br>
select Moviename,Heroname,Heroine from movies where length=(select max(length) from movies);<br>
END<br>

![P5](https://user-images.githubusercontent.com/78849193/110283845-bf258b80-8006-11eb-801e-52192352c2bb.PNG)
