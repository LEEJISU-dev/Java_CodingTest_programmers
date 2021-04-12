select D.lv as HOUR, nvl(e.cnt, 0) as COUNT
from (select to_char(DATETIME, 'HH24') as hour, count(*) as cnt 
      from ANIMAL_OUTS
     group by to_char(DATETIME, 'HH24')
     order by hour) E,
     (select (LEVEL-1)as lv from dual connect by LEVEL <=24) D
where D.lv = E.hour(+)
order by D.lv;