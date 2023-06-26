-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME, IF(SEX_UPON_INTAKE IN ('Neutered Male', 'Spayed Female'), 'O', 'X') AS '중성화'
from ANIMAL_INS
order by ANIMAL_ID