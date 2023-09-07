package orm;

import java.util.List;

public interface DeptDAO {
	//創建儲存部門資料的方法
	void save(Dept dept); // 參數 : 直接把要新增的部門部門物件傳進來
	void update(Dept dept);
	void delete(Integer depto);  //用員工編號直接刪除資料
	
	Dept findByDeptno(Integer deptno);  //用部門編號查詢部門裡所有員工資料
	List<Dept> getAll();   //用List的集合來查詢多筆部門資料
	
}
