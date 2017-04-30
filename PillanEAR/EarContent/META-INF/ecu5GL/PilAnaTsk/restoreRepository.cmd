@rem --
@rem --  Archivo:           restoreRepository.cmd                                   
@rem --  Fecha de Creación: Sabado 29 de Abril de 2017 - 14:28:25                   
@rem --  Autor:             Ecu5GL.GenCode 3.20C18H (implementOracle V 3.20C18H)    
@rem --                                                                             
@rem --  Objetivo:                                                                  
@rem --             Restaurador del proyecto Ecu5GL PilAnaTsk.                      
@rem --             Este archivo permite restaurar la especificación que da origen a este App.
@rem --             Al ser ejecutado, este comando despliega las instrucciones de uso.
@rem --                                                                             
@rem --  Copyright (c) CHABRETUAL LTDA (Chile) Derechos reservados.                 
@rem --                                                                             
@rem --  Este es un archivo generado.                                               
@rem --  NO MODIFIQUE ESTE ARCHIVO                                                  
@rem --                                                                             
@rem --
@echo procedimiento de recuperacion el proyecto PilAnaTsk
@echo  ------------------------------------------------------------------------
@echo  -  Este sistema fue generado con la opción "Utilizar WorkSpace BEA WEBLOGIC/Eclipse"
@echo  -  El sistema es apto para Eclipse
@echo  -  
@echo  -  Instrucciones:
@echo  -    Verifique que la version del generador sea compatible con 3.20C18H
@echo  -   Inicie la intefaz interactiva del generador Ecu5GL
@echo  -      (esto asigna correctamente los discos virtuales R: S: y T:)
@echo  -   Construya los siguientes proyectos Eclipse en R:/LocalWorkSpaceForBEA
@echo  -      R:/LocalWorkSpaceForBEA/PillanApp
@echo  -      R:/LocalWorkSpaceForBEA/PillanEjb
@echo  -      R:/LocalWorkSpaceForBEA/PillanClient
@echo  -      R:/LocalWorkSpaceForBEA/PillanWeb
@echo  -   Ejectute este comando desde la carpeta R:/LocalWorkSpaceForBEA/PillanApp
@echo  -   Nota: NO EJECUTE EL COMANDO DESDE Eclipse, pues Eclipse no conoce el disco R:
@echo  -   Genere la aplicacion con el generador Ecu5GL
@echo  ------------------------------------------------------------------------
@echo Presione Control C para cancelar esta operacion
@echo 
@pause
@echo S:\services\PIL_ANA_TSK.TXS
@     if not exist S:\services mkdir S:\services
@     copy   $services$PIL_ANA_TSK.TXS.gz     S:\services\PIL_ANA_TSK.TXS.gz /Y
@     pushd S:\services
@            T:\bin\gzip -9 -d -f -q PIL_ANA_TSK.TXS.gz
@     popd
@echo   restaurar proyecto Flex
@     if not exist  mkdir 
@     copy flex.tar.gz \flex.tar.gz /Y
@     pushd 
@     T:\bin\gzip -9 -d -f -q flex.tar.gz
@     T:\bin\tar  -xf flex.tar
@     del /Q flex.tar
@     popd
@echo la recuperacion del proyecto PilAnaTsk ha concluido
@pause
