import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DettagliMacchinaComponent } from './dettagli-macchina.component';

describe('DettagliMacchinaComponent', () => {
  let component: DettagliMacchinaComponent;
  let fixture: ComponentFixture<DettagliMacchinaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [DettagliMacchinaComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(DettagliMacchinaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
