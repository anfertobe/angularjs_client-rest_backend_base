(function () {
    var app = angular.module('modone', ['ngRoute']);

    app.config(function ($routeProvider) {
        $routeProvider

                // route for the about page
                .when('/familia', {
                    templateUrl: 'registrofamilia.html'

                })
                
                // route for the contact page
                .when('/terreno', {
                    templateUrl: 'registroterrenos.html'

                })
                
                .when('/rubro', {
                    templateUrl: 'registrorubros.html'

                })

                .when('/home', {
                    templateUrl: 'home.html'

                })
                .when('/jefes', {
                    templateUrl: 'registrarjefes.html'

                })
                .otherwise({
                        redirectTo: '/home'
                });
    });

    app.controller('RegistroJefes',
     function($http){
            this.jefe=
            {
                nombre : "",
                edad : 0,
                identificacion : "",
                nivelacademico : 0,
                cargo : 0,
                ubicacion : ""
            };
            
            this.registrar=function(){
                $http.post('rest/gipn/jefe', this.jefe).
                success(function (data, status, headers, config) {
                    alert('success!');
                }).
                error(function (data, status, headers, config) {
                    alert('error!' + data + this.familia);
                });
            };
     }
     );

    app.controller('RegistroFamilia',
     function($http){
            this.familia=
            {
                nombreCabeza : "",
                id : 0,
                edad : "",
                integrantes : 0,
                ingresos : 0,
                nivelAcademico : ""
            };
            
            this.registrar=function(){
                $http.post('rest/gipn/regifamilia', this.familia).
                success(function (data, status, headers, config) {
                    alert('success!');
                }).
                error(function (data, status, headers, config) {
                    alert('error!' + data + this.familia);
                });
            };
     }
     );
     
    app.controller('RegistrarTerrenos',
        function ($http){
            this.cabeza = 0;
            this.terreno = 
                {
                    nombre:"",
                    extencion:0,
                    tipoSuelo:"",
                    ph:"",
                    ASNM:"",
                    Ubicacion:""
                };

            this.terrenoreg=function(){
                $http.post('rest/gipn/familia/'+ this.cabeza +'/terreno', this.terreno).
                success(function (data, status, headers, config) {
                    alert('success!');
                }).
                error(function (data, status, headers, config) {
                    alert('error!' + data);
                });
            };
        }
    );
    


     
})();





