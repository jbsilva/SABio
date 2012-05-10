package sabio.spec;

import java.util.List;
import sabio.SABioException;
import vo.TreinoVO;

public interface ITreino {

    void create(TreinoVO vo) throws SABioException;

    void delete(int id) throws SABioException;

    void update(TreinoVO vo) throws SABioException;

    TreinoVO getTreinoById(int id) throws SABioException;

    List getAll() throws SABioException;
}
