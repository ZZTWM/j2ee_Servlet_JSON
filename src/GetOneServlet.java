import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;
/**
 *  1. 创建一个Hero对象
	2. 创建一个JSONObject 对象
	3. 把Hero对象转换为JSONObject 对象，并放在上一个JSONObject对象上，key是"hero"
	4. 设置编码方式为UTF-8
	5. 通过response返回
 * @author Administrator
 *
 */
public class GetOneServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
    	
    	Hero hero = new Hero();
    	hero.setName("盖伦");
    	hero.setHp(353);
    	
    	JSONObject json = new JSONObject();
    	
    	json.put("hero", JSONObject.fromObject(hero));
    	response.setContentType("text/html;charset=utf-8");
    	
    	response.getWriter().print(json);
    }
}
