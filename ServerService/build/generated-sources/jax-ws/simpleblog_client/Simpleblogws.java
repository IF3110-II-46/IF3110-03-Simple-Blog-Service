
package simpleblog_client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "simpleblogws", targetNamespace = "http://simpleblog/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Simpleblogws {


    /**
     * 
     * @param query
     * @return
     *     returns java.util.List<simpleblog_client.Posting>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "search", targetNamespace = "http://simpleblog/", className = "simpleblog_client.Search")
    @ResponseWrapper(localName = "searchResponse", targetNamespace = "http://simpleblog/", className = "simpleblog_client.SearchResponse")
    @Action(input = "http://simpleblog/simpleblogws/searchRequest", output = "http://simpleblog/simpleblogws/searchResponse")
    public List<Posting> search(
        @WebParam(name = "query", targetNamespace = "")
        String query);

    /**
     * 
     * @param judul
     * @param konten
     * @param tanggal
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addPost", targetNamespace = "http://simpleblog/", className = "simpleblog_client.AddPost")
    @ResponseWrapper(localName = "addPostResponse", targetNamespace = "http://simpleblog/", className = "simpleblog_client.AddPostResponse")
    @Action(input = "http://simpleblog/simpleblogws/addPostRequest", output = "http://simpleblog/simpleblogws/addPostResponse")
    public Boolean addPost(
        @WebParam(name = "judul", targetNamespace = "")
        String judul,
        @WebParam(name = "konten", targetNamespace = "")
        String konten,
        @WebParam(name = "tanggal", targetNamespace = "")
        XMLGregorianCalendar tanggal);

    /**
     * 
     * @return
     *     returns java.util.List<simpleblog_client.Posting>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listPost", targetNamespace = "http://simpleblog/", className = "simpleblog_client.ListPost")
    @ResponseWrapper(localName = "listPostResponse", targetNamespace = "http://simpleblog/", className = "simpleblog_client.ListPostResponse")
    @Action(input = "http://simpleblog/simpleblogws/listPostRequest", output = "http://simpleblog/simpleblogws/listPostResponse")
    public List<Posting> listPost();

    /**
     * 
     * @param judul
     * @param id
     * @param konten
     * @param published
     * @param tanggal
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "editPost", targetNamespace = "http://simpleblog/", className = "simpleblog_client.EditPost")
    @ResponseWrapper(localName = "editPostResponse", targetNamespace = "http://simpleblog/", className = "simpleblog_client.EditPostResponse")
    @Action(input = "http://simpleblog/simpleblogws/editPostRequest", output = "http://simpleblog/simpleblogws/editPostResponse")
    public Boolean editPost(
        @WebParam(name = "id", targetNamespace = "")
        String id,
        @WebParam(name = "judul", targetNamespace = "")
        String judul,
        @WebParam(name = "konten", targetNamespace = "")
        String konten,
        @WebParam(name = "tanggal", targetNamespace = "")
        XMLGregorianCalendar tanggal,
        @WebParam(name = "published", targetNamespace = "")
        int published);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deletePost", targetNamespace = "http://simpleblog/", className = "simpleblog_client.DeletePost")
    @ResponseWrapper(localName = "deletePostResponse", targetNamespace = "http://simpleblog/", className = "simpleblog_client.DeletePostResponse")
    @Action(input = "http://simpleblog/simpleblogws/deletePostRequest", output = "http://simpleblog/simpleblogws/deletePostResponse")
    public Boolean deletePost(
        @WebParam(name = "id", targetNamespace = "")
        String id);

    /**
     * 
     * @param id
     * @param published
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "publishPost", targetNamespace = "http://simpleblog/", className = "simpleblog_client.PublishPost")
    @ResponseWrapper(localName = "publishPostResponse", targetNamespace = "http://simpleblog/", className = "simpleblog_client.PublishPostResponse")
    @Action(input = "http://simpleblog/simpleblogws/publishPostRequest", output = "http://simpleblog/simpleblogws/publishPostResponse")
    public Boolean publishPost(
        @WebParam(name = "id", targetNamespace = "")
        String id,
        @WebParam(name = "published", targetNamespace = "")
        int published);

    /**
     * 
     * @return
     *     returns java.util.List<simpleblog_client.Akun>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listUser", targetNamespace = "http://simpleblog/", className = "simpleblog_client.ListUser")
    @ResponseWrapper(localName = "listUserResponse", targetNamespace = "http://simpleblog/", className = "simpleblog_client.ListUserResponse")
    @Action(input = "http://simpleblog/simpleblogws/listUserRequest", output = "http://simpleblog/simpleblogws/listUserResponse")
    public List<Akun> listUser();

    /**
     * 
     * @param id
     * @param email
     * @param role
     * @param nama
     * @param password
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "editUser", targetNamespace = "http://simpleblog/", className = "simpleblog_client.EditUser")
    @ResponseWrapper(localName = "editUserResponse", targetNamespace = "http://simpleblog/", className = "simpleblog_client.EditUserResponse")
    @Action(input = "http://simpleblog/simpleblogws/editUserRequest", output = "http://simpleblog/simpleblogws/editUserResponse")
    public Boolean editUser(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "nama", targetNamespace = "")
        String nama,
        @WebParam(name = "email", targetNamespace = "")
        String email,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "role", targetNamespace = "")
        int role);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteUser", targetNamespace = "http://simpleblog/", className = "simpleblog_client.DeleteUser")
    @ResponseWrapper(localName = "deleteUserResponse", targetNamespace = "http://simpleblog/", className = "simpleblog_client.DeleteUserResponse")
    @Action(input = "http://simpleblog/simpleblogws/deleteUserRequest", output = "http://simpleblog/simpleblogws/deleteUserResponse")
    public Boolean deleteUser(
        @WebParam(name = "id", targetNamespace = "")
        String id);

    /**
     * 
     * @param idPost
     * @return
     *     returns java.util.List<simpleblog_client.Komentar>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listComment", targetNamespace = "http://simpleblog/", className = "simpleblog_client.ListComment")
    @ResponseWrapper(localName = "listCommentResponse", targetNamespace = "http://simpleblog/", className = "simpleblog_client.ListCommentResponse")
    @Action(input = "http://simpleblog/simpleblogws/listCommentRequest", output = "http://simpleblog/simpleblogws/listCommentResponse")
    public List<Komentar> listComment(
        @WebParam(name = "id_post", targetNamespace = "")
        String idPost);

    /**
     * 
     * @param idKomen
     * @param idPost
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteComment", targetNamespace = "http://simpleblog/", className = "simpleblog_client.DeleteComment")
    @ResponseWrapper(localName = "deleteCommentResponse", targetNamespace = "http://simpleblog/", className = "simpleblog_client.DeleteCommentResponse")
    @Action(input = "http://simpleblog/simpleblogws/deleteCommentRequest", output = "http://simpleblog/simpleblogws/deleteCommentResponse")
    public Boolean deleteComment(
        @WebParam(name = "id_komen", targetNamespace = "")
        String idKomen,
        @WebParam(name = "id_post", targetNamespace = "")
        String idPost);

    /**
     * 
     * @param idPost
     * @return
     *     returns simpleblog_client.Posting
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPost", targetNamespace = "http://simpleblog/", className = "simpleblog_client.GetPost")
    @ResponseWrapper(localName = "getPostResponse", targetNamespace = "http://simpleblog/", className = "simpleblog_client.GetPostResponse")
    @Action(input = "http://simpleblog/simpleblogws/getPostRequest", output = "http://simpleblog/simpleblogws/getPostResponse")
    public Posting getPost(
        @WebParam(name = "id_post", targetNamespace = "")
        String idPost);

    /**
     * 
     * @param email
     * @param role
     * @param nama
     * @param password
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addUser", targetNamespace = "http://simpleblog/", className = "simpleblog_client.AddUser")
    @ResponseWrapper(localName = "addUserResponse", targetNamespace = "http://simpleblog/", className = "simpleblog_client.AddUserResponse")
    @Action(input = "http://simpleblog/simpleblogws/addUserRequest", output = "http://simpleblog/simpleblogws/addUserResponse")
    public Boolean addUser(
        @WebParam(name = "nama", targetNamespace = "")
        String nama,
        @WebParam(name = "email", targetNamespace = "")
        String email,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "role", targetNamespace = "")
        int role);

    /**
     * 
     * @param email
     * @param konten
     * @param nama
     * @param idPost
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addComment", targetNamespace = "http://simpleblog/", className = "simpleblog_client.AddComment")
    @ResponseWrapper(localName = "addCommentResponse", targetNamespace = "http://simpleblog/", className = "simpleblog_client.AddCommentResponse")
    @Action(input = "http://simpleblog/simpleblogws/addCommentRequest", output = "http://simpleblog/simpleblogws/addCommentResponse")
    public Boolean addComment(
        @WebParam(name = "id_post", targetNamespace = "")
        String idPost,
        @WebParam(name = "nama", targetNamespace = "")
        String nama,
        @WebParam(name = "email", targetNamespace = "")
        String email,
        @WebParam(name = "konten", targetNamespace = "")
        String konten);

}