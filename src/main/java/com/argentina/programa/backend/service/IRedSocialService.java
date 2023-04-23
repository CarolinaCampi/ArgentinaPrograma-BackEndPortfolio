package com.argentina.programa.backend.service;

import com.argentina.programa.backend.model.Header;
import com.argentina.programa.backend.model.RedSocial;

import java.util.List;

public interface IRedSocialService {

    public List<RedSocial> verRedesSociales();

    public void crearRedSocial(RedSocial red);

    public void borrarRedSocial(Long id);

    public RedSocial buscarRedSocial(Long id);

    public void modificarRedSocial(RedSocial red);

}
