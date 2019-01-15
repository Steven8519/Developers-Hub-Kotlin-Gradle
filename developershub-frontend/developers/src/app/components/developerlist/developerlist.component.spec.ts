import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {DeveloperlistComponent} from './developerlist.component';

describe('DeveloperlistComponent', () => {
  let component: DeveloperlistComponent;
  let fixture: ComponentFixture<DeveloperlistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DeveloperlistComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DeveloperlistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
