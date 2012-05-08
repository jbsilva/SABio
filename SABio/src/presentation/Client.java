package presentation;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import vo.TreinoVO;
import vo.UsuarioVO;
import sabio.SABioFactory;
import sabio.spec.ITreino;
import sabio.spec.IUsuario;

public class Client {

    public static void main(String[] args) throws Exception {

        SABioFactory factory = SABioFactory.getInstance();

        IUsuario user = factory.getUser();
        ITreino account = factory.getAccount();
        List userList;
        List accountList;
        UsuarioVO userVO;
        TreinoVO accountVO;
        Iterator iterator;

        userVO = new UsuarioVO("admin", "admin");
        user.authenticate(userVO);

        userList = user.getAll();
        iterator = userList.iterator();

        while (iterator.hasNext()) {
            userVO = (UsuarioVO) iterator.next();
            System.out.println(userVO);
        }

        if (userList.size() > 1) {
            // Atualizando o segundo
            userVO = (UsuarioVO) userList.get(1);
            userVO.setName("Atualizado");
            System.out.println("Updating " + userVO);
            user.update(userVO);
            // Removendo o primeiro
            userVO = (UsuarioVO) userList.get(0);
            int id = userVO.getId();
            accountVO = account.getTreinoByUsuario(id);

            if (accountVO != null) {
                System.out.println("Deleting " + accountVO);
                account.delete(accountVO.getId());
            }

            System.out.println("Deleting " + userVO);
            user.delete(userVO.getId());
        }

        // criando um novo
<<<<<<< HEAD
        userVO = new UsuarioVO("admin"
                + Calendar.getInstance().getTime().getTime(), "admin",
                "Administrador");
=======
        userVO = new UserVO("admin"
                + Calendar.getInstance().getTime().getTime(), "admin");
>>>>>>> origin/master
        System.out.println("Creating " + userVO);
        user.create(userVO);

        accountVO = new TreinoVO("0958-0", new Double(20.6f), userVO);
        System.out.println("Creating " + accountVO);
        account.create(accountVO);

        accountList = account.getAll();
        iterator = accountList.iterator();

        while (iterator.hasNext()) {
            accountVO = (TreinoVO) iterator.next();
            System.out.println(accountVO);
        }

        if (accountList.size() > 1) {

            TreinoVO vo1 = (TreinoVO) accountList.get(0);
            TreinoVO vo2 = (TreinoVO) accountList.get(1);

            vo1.setSaldo(vo1.getSaldo() - 100);
            vo2.setSaldo(vo2.getSaldo() + 100);
            account.update(vo1);
            account.update(vo2);
        }
    }
}
