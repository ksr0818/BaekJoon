-- 코드를 입력하세요
SELECT mcdp_cd as '진료과코드' ,count(MCDP_CD)as '5월예약건수' from appointment where Month(APNT_YMD) = 5 group by mcdp_cd order by 5월예약건수,진료과코드;