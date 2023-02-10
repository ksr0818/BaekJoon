-- 코드를 입력하세요
SELECT HOUR(DATETIME) as HOUR, count(DATETIME) from animal_outs where HOUR(DATETIME) >= 9 and HOUR(DATETIME) < 20 group by HOUR order by HOUR;