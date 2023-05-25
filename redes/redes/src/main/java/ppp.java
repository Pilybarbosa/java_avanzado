import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ppp extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String op=req.getParameter("op");
        System.out.println(op);
        switch (op) {
            case "Eliminar" :
            req.getRequestDispatcher("resources/assets/css/styleEliminar.css").forward(req, resp);
                break;
                case "styleins" :
            req.getRequestDispatcher("resources/assets/css/styleins.css").forward(req, resp);
                break;
                case "stylelogin" :
            req.getRequestDispatcher("resources/assets/css/stylelogin.css").forward(req, resp);
                break;
                case "stylepublicar" :
                req.getRequestDispatcher("resources/assets/css/stylepublicar.css").forward(req, resp);
                    break;
                    case "styleregistrar" :
            req.getRequestDispatcher("resources/assets/css/styleregistrar.css").forward(req, resp);
                break;
                case "styleamigos" :
                req.getRequestDispatcher("resources/assets/css/stylieamigos.css").forward(req, resp);
                    break;
            case "style" :
            req.getRequestDispatcher("resources/assets/css/style.css").forward(req, resp);
                break;
            case "amigos" :
            req.getRequestDispatcher("resources/views/amigos.jsp").forward(req, resp);
                break;
            case "instagram":
            req.getRequestDispatcher("resources/views/instagram.jsp").forward(req, resp);
                break;
            case "eliminar":
                req.getRequestDispatcher("resources/views/eliminar.jsp").forward(req, resp);
                    break;
            case "publicaciones":
                req.getRequestDispatcher("resources/views/publicacion.jsp").forward(req, resp);
                        break;
                        case "registrar":
                req.getRequestDispatcher("resources/views/registrar.jsp").forward(req, resp);
                    break;
                    case "index":
                req.getRequestDispatcher("index.jsp").forward(req, resp);
                    break;
                    case "login":
                req.getRequestDispatcher("resources/views/login.jsp").forward(req, resp);
                    break;
            default:
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String accion=req.getParameter("accion");
    System.out.println(accion);
        switch(accion){
            case "comentar":
                 editar cu=new editar(l);
                req.setAttribute("area", cu.calcularArea());
                req.getRequestDispatcher("resultado.jsp").forward(req, resp);
            break;

        }
    }
    


    
}
