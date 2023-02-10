-- 코드를 입력하세요
SELECT INGREDIENT_TYPE, sum(total_order) as TOTAL_ORDER from first_half join ICECREAM_INFO on first_half.flavor = icecream_info.flavor group by INGREDIENT_TYPE;