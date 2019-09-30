<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
          
          
    <div class="content content-fixed content-auth">
      <div class="container">
        <div class="media align-items-stretch justify-content-center ht-100p pos-relative">
          <div class="media-body align-items-center d-none d-lg-flex">
            <div class="mx-wd-600">
              <img src="static/assets/img/img15.png" class="img-fluid" alt="">
            </div>
            <div class="pos-absolute b-0 l-0 tx-12 tx-center">
              Workspace design vector is created by <a href="https://www.freepik.com/pikisuperstar" target="_blank">pikisuperstar (freepik.com)</a>
            </div>
          </div><!-- media-body -->
          <div class="sign-wrapper mg-lg-l-50 mg-xl-l-60">
            <div class="wd-100p">
              <h3 class="tx-color-01 mg-b-5">Sign In</h3>
              <p class="tx-color-03 tx-16 mg-b-40">Welcome back! Please signin to continue.</p>

            <!--   <div class="form-group">
                <label>Email address</label>
                <input type="email" class="form-control" placeholder="yourname@yourmail.com">
              </div>
              <div class="form-group">
                <div class="d-flex justify-content-between mg-b-5">
                  <label class="mg-b-0-f">Password</label>
                  <a href="#" class="tx-13">Forgot password?</a>
                </div>
                <input type="password" class="form-control" placeholder="Enter your password">
              </div>
              <button class="btn btn-brand-02 btn-block">Sign In</button>
              <div class="divider-text">or</div>-->
              
              <a class="btn btn-social" href="${GOOGLE_AUTH_URL}">Sign In With <i class="fab fa-google"></i> Google</a>
              <a class="btn btn-social" href="${FACEBOOK_AUTH_URL}">Sign In With <i class="fab fa-facebook"></i> Facebook</a>
              <a class="btn btn-social" href="${LINKEDIN_AUTH_URL}">Sign In With <i class="fab fa-linkedin"></i> LinkedIn</a>
              <a class="btn btn-social" href="${TWITTER_AUTH_URL}">Sign In With <i class="fab fa-twitter"></i> Twitter</a>
              <a class="btn btn-social" href="${GITHUB_AUTH_URL}">Sign In With <i class="fab fa-github"></i> Github</a>
              <div class="divider-text">or</div>
              <div class="tx-13 mg-t-20 tx-center">Don't have an account? <a href="javascript:void">Create an Account</a></div>
            </div>
          </div><!-- sign-wrapper -->
        </div><!-- media -->
      </div><!-- container -->
    </div><!-- content -->