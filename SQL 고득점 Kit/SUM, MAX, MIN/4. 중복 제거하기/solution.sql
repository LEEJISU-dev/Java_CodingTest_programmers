SELECT count(DISTINCT NAME) as count
FROM ANIMAL_INS
where NAME is not null;