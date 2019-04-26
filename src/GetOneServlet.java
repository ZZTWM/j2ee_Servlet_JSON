import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;
/**
 *  1. ����һ��Hero����
	2. ����һ��JSONObject ����
	3. ��Hero����ת��ΪJSONObject ���󣬲�������һ��JSONObject�����ϣ�key��"hero"
	4. ���ñ��뷽ʽΪUTF-8
	5. ͨ��response����
 * @author Administrator
 *
 */
public class GetOneServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
    	
    	Hero hero = new Hero();
    	hero.setName("����");
    	hero.setHp(353);
    	
    	JSONObject json = new JSONObject();
    	
    	json.put("hero", JSONObject.fromObject(hero));
    	response.setContentType("text/html;charset=utf-8");
    	
    	response.getWriter().print(json);
    }
}
