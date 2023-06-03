SELECT WAREHOUSE_ID,    WAREHOUSE_NAME, ADDRESS, COALESCE(freezer_yn, 'N') AS phone_number
from food_warehouse
WHERE ADDRESS LIKE '경기도%'
order by warehouse_id