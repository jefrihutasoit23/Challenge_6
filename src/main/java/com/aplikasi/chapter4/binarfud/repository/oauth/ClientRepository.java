package com.aplikasi.chapter4.binarfud.repository.oauth;


import com.aplikasi.chapter4.binarfud.entity.oauth.Client;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClientRepository extends PagingAndSortingRepository<Client, Long> {

    Client findOneByClientId(String clientId);

}
