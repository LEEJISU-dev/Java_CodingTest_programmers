SELECT NAME
from (select rank() over(order by DATETIME asc) rc, NAME
      from ANIMAL_INS )
where rc = 1;