-- 코드를 입력하세요
SELECT ANIMAL_TYPE , count(animal_type) as count from animal_ins group by animal_type order by animal_type;