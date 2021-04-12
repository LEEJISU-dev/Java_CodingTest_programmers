SELECT distinct to_char(DATETIME,'HH24') as HOUR, 
        count(to_char(DATETIME,'HH24')) as count
from ANIMAL_OUTS 
where to_char(DATETIME,'HH24') > '08' and to_char(DATETIME,'HH24') < '20'
group by to_char(DATETIME,'HH24')
order by to_char(DATETIME,'HH24');