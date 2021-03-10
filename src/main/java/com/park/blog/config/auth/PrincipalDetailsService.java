package com.park.blog.config.auth;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.park.blog.domain.user.User;
import com.park.blog.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PrincipalDetailsService implements UserDetailsService {
	
	private final UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("/login이 호출 되면 자동으로 실행되어 username이 DB에 있는지 확인한다.");
		User principal = userRepository.findByUsername(username);
		
		if(principal == null) {
			return null;
		} else {
			return new PrincipalDetails(principal);
			
		}
	}
	
}
